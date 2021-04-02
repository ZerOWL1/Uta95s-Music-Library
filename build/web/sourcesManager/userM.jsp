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
                                <h2>User Manager</h2>
                            </div>
                            <div class="col-sm-6">
                            </div>
                        </div>
                    </div>
                    <table class="table table-striped table-hover">
                        <thead>
                            <tr>
                                <th>
                                    <span class="custom-checkbox">
                                        <input class="checkUser" type="checkbox" id="selectAllUser">
                                        <label for="selectAllUser"></label>
                                    </span>
                                </th>
                                <th>UID</th>
                                <th>Name</th>
                                <th>Password</th>
                                <th>Mail</th>
                                <th>Actions</th>
                            </tr>
                        </thead>
                        <!--value-->
                        <tbody>
                            <c:forEach items="${listAC}" var="a">
                                <c:if test="${!(sessionScope.acc.uid eq a.uid)}">
                                <tr>
                                    <td>
                                        <span class="custom-checkbox">
                                            <input class="checkUser" type="checkbox" id="checkboxUser" name="options[]" value="1">
                                            <label for="checkboxUser"></label>
                                        </span>
                                    </td>
                                    <td>${a.uid}</td>
                                    <td>${a.name}</td>
                                    <td>${a.pass}</td>
                                    <td>${a.email}</td>
                                    <td>
                                        <a href="editU?uID=${a.uid}" class="edit" ><i class="material-icons" data-toggle="tooltip">&#xE254;</i></a>
                                        <a onclick="return ConfirmDelete()" href="delete?uID=${a.uid}" class="delete" ><i class="material-icons" data-toggle="tooltip">&#xE872;</i></a>
                                    </td>
                                </tr>
                                </c:if>
                            </c:forEach>
                        </tbody>
                    </table>
                     </table>
                    <div class="clearfix">
                        <div class="hint-text">Showing <b>10</b> out of all entries</div>
                        <ul class="pagination">
                            <c:if test="${uTag > 1}">
                                <li class="page-item"><a href="manage?uIndex=${uTag-1}&tagP=4">Previous</a>
                                </li>
                            </c:if>
                            <c:forEach  var="i" begin="1" end="${uEnd}">
                                <li class="page-item ${uTag == i?"active":""}">
                                    <a href="manage?uIndex=${i}&tagP=4" class="page-link">${i}</a>
                                </li>
                            </c:forEach>
                            <c:if test="${uTag < uEnd}">
                                <li class="page-item"><a href="manage?uIndex=${uTag+1}&tagP=4" class="page-link">Next</a>
                                </li>
                            </c:if>
                        </ul>
                    </div>
                </div>
            </div>        
        </div>

        <script>
            $(document).ready(function () {
            // Activate tooltip
            $('[data-toggle="tooltip"]').tooltip();
            // Select/Deselect checkboxes
            var checkbox = $('table tbody .checkUser[type="checkbox"]');
            $("#selectAllUser").click(function () {
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
            $("#selectAllUser").prop("checked", false);
            }
            });
            }

            //confirm delete
            function ConfirmDelete() {
            var x = confirm("Are you sure you want to delete?");
            if (x)
                    window.alert("Delete Success!!");
            else
                    return false;
            }
            

            );
        </script>
    </body>
</html>