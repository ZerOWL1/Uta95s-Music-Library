<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <title></title>
        <!--bootstrap css-->
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/aplayer/1.10.1/APlayer.min.css" integrity="sha512-CIYsJUa3pr1eoXlZFroEI0mq0UIMUqNouNinjpCkSWo3Bx5NRlQ0OuC6DtEB/bDqUWnzXc1gs2X/g52l36N5iw==" crossorigin="anonymous" />
        <script src="https://cdnjs.cloudflare.com/ajax/libs/aplayer/1.10.1/APlayer.min.js" integrity="sha512-RWosNnDNw8FxHibJqdFRySIswOUgYhFxnmYO3fp+BgCU7gfo4z0oS7mYFBvaa8qu+axY39BmQOrhW3Tp70XbaQ==" crossorigin="anonymous"></script>
    </head>
    <body>
        <div class="table-container">
            <div id="aplayer"></div>
            <div class="table-responsive">
                <div class="table-wrapper">
                    <div class="table-title">
                        <div class="row">
                            <div class="col-sm-6">
                                <h2>Favorite Manager</h2>
                            </div>
                        </div>
                    </div>
                    <table class="table table-striped table-hover">
                        <thead>
                            <tr>
                                <th>
                                    <span class="custom-checkbox">
                                        <input class="checkFavorite" type="checkbox" id="selectAllFavorite">
                                        <label for="selectAllFavorite"></label>
                                    </span>
                                </th>
                                <th>Name</th>
                                <th>Release</th>
                                <th>Actions</th>
                            </tr>
                        </thead>
                        <tbody>
                            <c:forEach items="${sFavo}" var="sFavo">
                                <tr>
                                    <td>
                                        <span class="custom-checkbox">
                                            <input class="checkFavorite" type="checkbox" id="checkboxFavorite" name="options[]" value="1">
                                            <label for="checkboxFavorite"></label>
                                        </span>
                                    </td>
                                    <td>${sFavo.name}</td>
                                    <td>${sFavo.release}</td>
                                    <td class="favoIcon">
                                        <a onclick="return ConfirmDelete()"href="delete?sFavor=${sFavo.sid}" class="delete"><i class="material-icons" data-toggle="tooltip">&#xE872;</i></a>
                                    </td>
                                </tr>
                            </c:forEach>
                        </tbody>
                    </table>
                    <div class="clearfix">
                        <div class="hint-text">Showing <b>10</b> out of all entries</div>
                        <ul class="pagination">
                            <c:if test="${faTag > 1}">
                                <li class="page-item"><a href="manage?faIndex=${faTag-1}&tagP=3">Previous</a>
                                </li>
                            </c:if>
                            <c:forEach  var="i" begin="1" end="${faEnd}">
                                <li class="page-item ${faTag == i?"active":""}">
                                    <a href="manage?faIndex=${i}&tagP=3" class="page-link">${i}</a>
                                </li>
                            </c:forEach>
                            <c:if test="${faTag < faEnd}">
                                <li class="page-item"><a href="manage?faIndex=${faTag+1}&tagP=3" class="page-link">Next</a>
                                </li>
                            </c:if>
                        </ul>
                    </div>
                </div>
            </div>        
        </div>

        <!-- Delete Modal HTML -->
        <div id="deleteFavorite" class="modal fade">
            <div class="modal-dialog">
                <div class="modal-content">
                    <form>
                        <div class="modal-header">						
                            <h4 class="modal-title">Delete Favorite</h4>
                            <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
                        </div>
                        <div class="text-warning modal-body">					
                            <p>Are you sure you want to delete this Song?</p>
                            <p class="text-warning"><small>This action cannot be undone.</small></p>
                        </div>
                        <div class="modal-footer">
                            <input type="button" class="btn btn-default bg-info" data-dismiss="modal" value="Cancel">
                            <input type="submit" class="btn btn-danger" value="Delete">
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
                var checkbox = $('table tbody .checkFavorite[type="checkbox"]');
                $("#selectAllFavorite").click(function () {
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
                        $("#selectAllFavorite").prop("checked", false);
                    }
                });
            });
            const ap = new APlayer({
                container: document.getElementById('aplayer'),
                audio: [
            <c:forEach items="${allFavor}" var="sFar">
                    {
                        name: '${sFar.name}',
                        artist: '${sFar.idArtist}',
                        url: '${sFar.song_path}',
                        cover: '${sFar.img_path}'
                    },
            </c:forEach>
                ]
            });
            
            function ConfirmDelete() {
            var x = confirm("Are you sure you want to delete?");
            if (x)
                    window.alert("Delete Success!!");
            else
                    return false;
            }
        </script>
        <script src="https://kit.fontawesome.com/c41956cca0.js" crossorigin="anonymous"></script>
    </body>
</html>