<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <title></title>
    </head>
    <body>
        <div class="table-container">
            <div class="table-responsive">
                <div class="table-wrapper album-wrapper">
                    <div class="table-title">
                        <div class="row">
                            <div class="col-sm-6">
                                <h2>Album Manager</h2>
                            </div>
                            <div class="col-sm-6">
                                <a href="#addAlbum" class="btn btn-success" data-toggle="modal"><i class="material-icons">&#xE147;</i> <span>Add New Album</span></a>
                                <a href="#deleteAlbum" class="btn btn-danger" data-toggle="modal"><i class="material-icons">&#xE15C;</i> <span>Delete</span></a>						
                            </div>
                        </div>
                    </div>
                    <table class="table table-striped table-hover">
                        <thead>
                            <tr>
                                <th>
                                    <span class="custom-checkbox">
                                        <input class="checkArtist" type="checkbox" id="selectAllAlbum">
                                        <label for="selectAllAlbum"></label>
                                    </span>
                                </th>
                                <th>AlbumID</th>
                                <th>ArtistID</th>
                                <th>Name</th>
                                <th>Year</th>
                                <th>AImg_path</th>
                                <th>Date Update</th>
                                <th>Genre</th>
                                <th>Actions</th>
                            </tr>
                        </thead>
                        <!--value-->
                        <tbody>
                            <c:forEach items="${listAl}" var="alb">
                            <tr>
                                <td>
                                    <span class="custom-checkbox">
                                        <input class="checkAlbum" type="checkbox" id="checkboxArtist" name="options[]" value="1">
                                        <label for="checkboxAlbum"></label>
                                    </span>
                                </td>
                                <td>${alb.idAlbum}</td>
                                <td>${alb.idArtist}</td>
                                <td>${alb.name}</td>
                                <td>${alb.year}</td>
                                <td>${alb.AImg_path}</td>
                                <td>${alb.date}</td>
                                <td>${alb.idGenre}</td>
                                <td>
                                    <a href="editAlb?alb=${alb.idAlbum}" class="edit" ><i class="material-icons" data-toggle="tooltip">&#xE254;</i></a>
                                    <a onclick="return ConfirmDelete()" href="delete?alb=${alb.idAlbum}" class="delete" ><i class="material-icons" data-toggle="tooltip">&#xE872;</i></a>
                                </td>
                            </tr>
                        </c:forEach>
                        </tbody>
                    </table>
                    <div class="clearfix">
                        <div class="hint-text">Showing <b>10</b> out of all entries</div>
                        <ul class="pagination">
                            <c:if test="${albTag > 1}">
                                <li class="page-item"><a href="manage?albIndex=${albTag-1}&tagP=8">Previous</a>
                                </li>
                            </c:if>
                            <c:forEach  var="i" begin="1" end="${albEnd}">
                                <li class="page-item ${albTag == i?"active":""}">
                                    <a href="manage?albIndex=${i}&tagP=8" class="page-link">${i}</a>
                                </li>
                            </c:forEach>
                            <c:if test="${albTag < albEnd}">
                                <li class="page-item"><a href="manage?albIndex=${albTag+1}&tagP=8" class="page-link">Next</a>
                                </li>
                            </c:if>
                        </ul>
                    </div>
                </div>
            </div>        
        </div>
        <!-- add Modal HTML -->
        <div id="addAlbum" class="modal fade">
            <div class="modal-dialog">
                <div class="modal-content">
                    <form action="addAlb" method="post">
                        <div class="modal-header">						
                            <h4 class="modal-title">Add New Album</h4>
                            <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
                        </div>
                        <div class="modal-body">
                             <div class="wrong-form-group">
                                <p class="wrong">${checkAlb}</p>
                            </div>
                            <div class="form-group">
                                <label>AlbumID</label>
                                <input name="albID" type="text" class="form-control" required>
                            </div>
                            <div class="form-group">
                                <label>Artist</label>
                                <select name="albArtist"  class="form-select" required="">
                                    <c:forEach items="${artM}" var="art">
                                        <option value="${art.idArtist}">${art.nameArtist}</option>
                                    </c:forEach>
                                </select>
                            </div>
                            <div class="form-group">
                                <label>Name</label>
                                <input name="albName" type="text" class="form-control" required>
                            </div>
                            <div class="form-group">
                                <label>Year</label>
                                <input name="albYear" type="text" class="form-control" >
                            </div>
                            <div class="form-group">
                                <label>AImg_path</label>
                                <input name="albPath" type="text" class="form-control" >
                            </div>
                            <div class="form-group">
                                <label>Genre</label>
                                <select name="albGenre"  class="form-select" required="">
                                     <c:forEach items="${genreM}" var="gen">
                                        <option value="${gen.idGenre}">${gen.name}</option>
                                    </c:forEach>   
                                </select>
                            </div>
                        </div>
                        <div class="modal-footer">
                            <input type="button" class="btn btn-default bg-info" data-dismiss="modal" value="Cancel">
                            <input onclick="ConfirmAdd()" type="submit" class="btn btn-success" value="Add">
                        </div>
                    </form>
                </div>
            </div>
        </div>

        <script>
            $(document).ready(function () {
                // Activate tooltip
                $('[data-toggle="tooltip"]').tooltip();

                // Select/Deselect checkboxes
                var checkbox = $('table tbody .checkAlbum[type="checkbox"]');
                $("#selectAllAlbum").click(function () {
                    if (this.checked) {
                        checkbox.each(function () {
                            this.checked = true;
                        });
                    } else {
                        checkbox.each(function () {
                            this.checked = false;
                        });
                    }
                });
                checkbox.click(function () {
                    if (!this.checked) {
                        $("#selectAllAlbum").prop("checked", false);
                    }
                });
            });
            
            
            function ConfirmDelete() {
            var x = confirm("Are you sure you want to delete?");
            if (x)
                    window.alert("Delete Success!!");
            else
                    return false;
            }
            
             //confirm add
            function ConfirmAdd() {
                return window.alert("Please check again data!!");
            }
        </script>
    </body>
</html>