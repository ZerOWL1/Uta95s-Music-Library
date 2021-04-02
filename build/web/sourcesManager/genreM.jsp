<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
    <head>
        <jsp:useBean id="genre" class="DAO.LoadDAO" scope="request"></jsp:useBean>
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
                                    <h2>Genre Manager</h2>
                                </div>
                                <div class="col-sm-6">
                                    <a href="#addGenre" class="btn btn-success" data-toggle="modal"><i class="material-icons">&#xE147;</i> <span>Add New Genre</span></a>
                                    <a href="#deleteGenre" class="btn btn-danger" data-toggle="modal"><i class="material-icons">&#xE15C;</i> <span>Delete</span></a>						
                                </div>
                            </div>
                        </div>
                        <table class="table table-striped table-hover">
                            <thead>
                                <tr>
                                    <th>
                                        <span class="custom-checkbox">
                                            <input class="checkGenre" type="checkbox" id="selectAllGenre">
                                            <label for="selectAllGenre"></label>
                                        </span>
                                    </th>
                                    <th>GenreID</th>
                                    <th>Name</th>
                                    <th>Actions</th>
                                </tr>
                            </thead>
                            <!--value-->
                            <tbody>
                            <c:forEach items="${listCate}" var="genM">
                                <tr>
                                    <td>
                                        <span class="custom-checkbox">
                                            <input class="checkGenre" type="checkbox" id="checkboxGenre" name="options[]" value="1">
                                            <label for="checkboxGenre"></label>
                                        </span>
                                    </td>
                                    <td>${genM.idGenre}</td>
                                    <td>${genM.name}</td>
                                    <td>
                                        <a href="editG?gid=${genM.idGenre}" class="edit" ><i class="material-icons" data-toggle="tooltip">&#xE254;</i></a>
                                        <a onclick="return ConfirmDelete()" href="delete?gid=${genM.idGenre}" class="delete"><i class="material-icons" data-toggle="tooltip">&#xE872;</i></a>
                                    </td>
                                </tr>
                            </c:forEach>
                        </tbody>
                    </table>
                    <div class="clearfix">
                        <div class="hint-text">Showing <b>10</b> out of all entries</div>
                        <ul class="pagination">
                            <c:if test="${genTag > 1}">
                                <li class="page-item"><a href="manage?genIndex=${genTag-1}&tagP=6">Previous</a>
                                </li>
                            </c:if>
                            <c:forEach  var="i" begin="1" end="${genEnd}">
                                <li class="page-item ${genTag == i?"active":""}">
                                    <a href="manage?genIndex=${i}&tagP=6" class="page-link">${i}</a>
                                </li>
                            </c:forEach>
                            <c:if test="${genTag < genEnd}">
                                <li class="page-item"><a href="manage?genIndex=${genTag+1}&tagP=6" class="page-link">Next</a>
                                </li>
                            </c:if>
                        </ul>
                    </div>
                </div>
            </div>        
        </div>
        <!-- add Modal HTML -->
        <div id="addGenre" class="modal fade">
            <div class="modal-dialog">
                <div class="modal-content">
                    <form action="addG" method="post">
                        <div class="modal-header">						
                            <h4 class="modal-title">Add New Genre</h4>
                            <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
                        </div>
                        <div class="modal-body">					
                            <div class="wrong-form-group">
                                <p class="wrong">${checkG}</p>
                            </div>
                            <div class="form-group">
                                <label>ID Genre</label>
                                <input name="idG" type="tel" class="form-control" required>
                            </div>
                            <div class="form-group">
                                <label>Name</label>
                                <input name="nameG" type="text" class="form-control" required>
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
                var checkbox = $('table tbody .checkGenre[type="checkbox"]');
                $("#selectAllGenre").click(function () {
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
                        $("#selectAllGenre").prop("checked", false);
                    }
                });
            });


            //confirm delete
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