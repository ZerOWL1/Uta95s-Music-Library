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
                <div class="table-wrapper song-wrapper">
                    <div class="table-title">
                        <div class="row">
                            <div class="col-sm-6">
                                <h2>Song Management</h2>
                            </div>
                            <div class="col-sm-6">
                                <a href="#addSong" class="btn btn-success" data-toggle="modal"><i class="material-icons">&#xE147;</i> <span>Add New Song</span></a>
                                <a href="#deleteSong" class="btn btn-danger" data-toggle="modal"><i class="material-icons">&#xE15C;</i> <span>Delete</span></a>						
                            </div>
                        </div>
                    </div>
                    <table class="table table-striped table-hover">
                        <thead>
                            <tr>
                                <th>
                                    <span class="custom-checkbox">
                                        <input class="checkSong" type="checkbox" id="selectAllSong">
                                        <label for="selectAllSong"></label>
                                    </span>
                                </th>
                                <th>SongID</th>
                                <th>Name</th>
                                <th>Release</th>
                                <th>idAlbum</th>
                                <th>idArtist</th>
                                <th>idGenre</th>
                                <th>mv_path</th>
                                <th>song_path</th>
                                <th>img_path</th>
                                <th>Actions</th>
                            </tr>
                        </thead>
                        <!--value-->
                        <tbody>
                            <c:forEach items="${listS}" var="alS">
                                <tr>
                                    <td>
                                        <span class="custom-checkbox">
                                            <input class="checkSong" type="checkbox" id="checkboxSong" name="options[]" value="1">
                                            <label for="checkboxSong"></label>
                                        </span>
                                    </td>
                                    <td>${alS.songID}</td>
                                    <td>${alS.name}</td>
                                    <td>${alS.release}</td>
                                    <td>${alS.idAlbum}</td>
                                    <td>${alS.idArtist}</td>
                                    <td>${alS.idGenre}</td>
                                    <td>${alS.mv_path}</td>
                                    <td>${alS.song_path}</td>
                                    <td>${alS.img_path}</td>
                                    <td>
                                        <a href="editS?sid=${alS.songID}" class="edit" ><i class="material-icons" data-toggle="tooltip">&#xE254;</i></a>
                                        <a onclick="return ConfirmDelete()"href="delete?sid=${alS.songID}" class="delete" ><i class="material-icons" data-toggle="tooltip">&#xE872;</i></a>
                                    </td>
                                </tr>
                            </c:forEach>
                        </tbody>
                    </table>
                    <div class="clearfix">
                        <div class="hint-text">Showing <b>10</b> out of all entries</div>
                        <ul class="pagination">
                            <c:if test="${sTag > 1}">
                                <li class="page-item"><a href="manage?sindex=${sTag-1}&tagP=5">Previous</a>
                                </li>
                            </c:if>
                            <c:forEach  var="i" begin="1" end="${sEnd}">
                                <li class="page-item ${sTag == i?"active":""}">
                                    <a href="manage?sindex=${i}&tagP=5" class="page-link">${i}</a>
                                </li>
                            </c:forEach>
                            <c:if test="${sTag < sEnd}">
                                <li class="page-item"><a href="manage?sindex=${sTag+1}&tagP=5" class="page-link">Next</a>
                                </li>
                            </c:if>
                        </ul>
                    </div>
                </div>
            </div>        
        </div>
        <!-- add Modal HTML -->
        <div id="addSong" class="modal fade">
            <div class="modal-dialog">
                <div class="modal-content">
                    <form action="addS" method="post">
                        <div class="modal-header">						
                            <h4 class="modal-title">Add New Song</h4>
                            <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
                        </div>
                        <div class="modal-body">
                            <div class="wrong-form-group">
                                <p class="wrong">${checkS}</p>
                            </div>
                            <div class="form-group">
                                <label>SongID</label>
                                <input name="idS" type="number" class="form-control">
                            </div>
                            <div class="form-group">
                                <label>Name</label>
                                <input name="nameS" type="text" class="form-control" required>
                            </div>
                            <div class="form-group">
                                <label>Release</label>
                                <input name="releaseS" type="text" class="form-control" >
                            </div>
                            <div class="form-group">
                                <label>Album</label>
                                <select name="idAlbumS"  class="form-select" required="">
                                    <c:forEach items="${albM}" var="alb">
                                        <option value="${alb.idAlbum}">${alb.name}</option>
                                    </c:forEach>
                                </select>
                            </div>
                            <div class="form-group">
                                <label>Artist</label>
                                <select name="idArtistS"  class="form-select" required="">
                                    <c:forEach items="${artM}" var="art">
                                        <option value="${art.idArtist}">${art.nameArtist}</option>
                                    </c:forEach>
                                </select>
                            </div>
                            <div class="form-group">
                                <label>Genre</label>
                                <select name="genreS"  class="form-select" required="">
                                    <c:forEach items="${genreM}" var="gen">
                                        <option value="${gen.idGenre}">${gen.name}</option>
                                    </c:forEach>   
                                </select>
                            </div>
                            <div class="form-group">
                                <label>MV_path</label>
                                <input name="mv_path" type="text" class="form-control" >
                            </div>
                            <div class="form-group">
                                <label>Song_path</label>
                                <input name="song_path" type="text" class="form-control" required>
                            </div>
                            <div class="form-group">
                                <label>Img_path</label>
                                <input name="img_path" type="text" class="form-control">
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
                var checkbox = $('table tbody .checkSong[type="checkbox"]');
                $("#selectAllSong").click(function () {
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
                        $("#selectAllSong").prop("checked", false);
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