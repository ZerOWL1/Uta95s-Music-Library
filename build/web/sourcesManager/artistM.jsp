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
                <div class="table-wrapper">
                    <div class="table-title">
                        <div class="row">
                            <div class="col-sm-6">
                                <h2>Artist Manager</h2>
                            </div>
                            <div class="col-sm-6">
                                <a href="#addArtist" class="btn btn-success" data-toggle="modal"><i class="material-icons">&#xE147;</i> <span>Add New Artist</span></a>
                                <a href="#deleteArtist" class="btn btn-danger" data-toggle="modal"><i class="material-icons">&#xE15C;</i> <span>Delete</span></a>						
                            </div>
                        </div>
                    </div>
                    <table class="table table-striped table-hover">
                        <thead>
                            <tr>
                                <th>
                                    <span class="custom-checkbox">
                                        <input class="checkArtist" type="checkbox" id="selectAllArtist">
                                        <label for="selectAllArtist"></label>
                                    </span>
                                </th>
                                <th>ArtistID</th>
                                <th>Name</th>
                                <th>Band</th>
                                <th>SpellName</th>
                                <th>Actions</th>
                            </tr>
                        </thead>
                        <!--value-->
                        <tbody>
                            <c:forEach items="${listArt}" var="art">
                                <tr>
                                    <td>
                                        <span class="custom-checkbox">
                                            <input class="checkArtist" type="checkbox" id="checkboxArtist" name="options[]" value="1">
                                            <label for="checkboxArtist"></label>
                                        </span>
                                    </td>
                                    <td>${art.idArtist}</td>
                                    <td>${art.nameArtist}</td>
                                    <td>${art.band}</td>
                                    <td>${art.spellName}</td>
                                    <td>
                                        <a href="editArt?art=${art.idArtist}" class="edit" ><i class="material-icons" data-toggle="tooltip">&#xE254;</i></a>
                                        <a onclick="return ConfirmDelete()" href="delete?art=${art.idArtist}" class="delete" ><i class="material-icons" data-toggle="tooltip">&#xE872;</i></a>
                                    </td>
                                </tr>
                            </c:forEach>
                        </tbody>
                    </table>
                    <div class="clearfix">
                        <div class="hint-text">Showing <b>10</b> out of all entries</div>
                        <ul class="pagination">
                            <c:if test="${artTag > 1}">
                                <li class="page-item"><a href="manage?artIndex=${artTag-1}&tagP=7">Previous</a>
                                </li>
                            </c:if>
                            <c:forEach  var="i" begin="1" end="${artEnd}">
                                <li class="page-item ${artTag == i?"active":""}">
                                    <a href="manage?artIndex=${i}&tagP=7" class="page-link">${i}</a>
                                </li>
                            </c:forEach>
                            <c:if test="${artTag < artEnd}">
                                <li class="page-item"><a href="manage?artIndex=${artTag+1}&tagP=7" class="page-link">Next</a>
                                </li>
                            </c:if>
                        </ul>
                    </div>
                </div>
            </div>        
        </div>
        <!-- add Modal HTML -->
        <div id="addArtist" class="modal fade">
            <div class="modal-dialog">
                <div class="modal-content">
                    <form action="addArt" method="post">
                        <div class="modal-header">						
                            <h4 class="modal-title">Add New Artist</h4>
                            <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
                        </div>
                        <div class="modal-body">	
                            <div class="wrong-form-group">
                                <p class="wrong">${checkArt}</p>
                            </div>
                            <div class="form-group">
                                <label>ArtistID</label>
                                <input name="artID" type="text" class="form-control" required>
                            </div>
                            <div class="form-group">
                                <label>Name</label>
                                <input name="artName" type="text" class="form-control" required>
                            </div>
                            <div class="form-group">
                                <label>Band</label>
                                <input name="artBand" type="text" class="form-control" >
                            </div>
                            <div class="form-group">
                                <label>Spell Name</label>
                                <input name="artSName" type="text" class="form-control" >
                            </div>
                        </div>
                        <div class="modal-footer">
                            <input type="button" class="btn btn-default bg-info" data-dismiss="modal" value="Cancel">
                            <input onclick="ConfirmAdd()"  type="submit" class="btn btn-success" value="Add">
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
                var checkbox = $('table tbody .checkArtist[type="checkbox"]');
                $("#selectAllArtist").click(function () {
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
                        $("#selectAllArtist").prop("checked", false);
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