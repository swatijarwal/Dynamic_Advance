<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>

<html>

<head>
</head>

<body>

    <table width="100%" border="0">
        <tr>
            <td widtd="90%"><a href="welcome.html">Welcome</b></a> |
                <a href="index.html">Logout</b></a>
            </td>
            <td rowspan="2">
                <h1 align="Right">
                                    <img src="images/rays.jpg">
                
                </h1>
            </td>
        </tr>
        <tr>
            <td>
                <h3>
                    Hi, admin (Admin)</h3>
            </td>
        </tr>
        <tr>
            <td colspan="2">
                <a href="GetMarksheet.html">Get Marksheet</b></a> |
                <a href="MarksheetMeritList.html">Marksheet Merit
                    List</b>
                </a> | <a href="MyProfile.html">MyProfile</b></a> |
                <a href="ChangePassword.html">Change Password</b></a> |
                <a href="NotFound.html">Java Doc</b></a> |
                <a href="Marksheet.html">Add
                    Marksheet</b></a> | <a href="MarksheetList.html">Marksheet List</b></a> |
                <a href="NotFound.html">Add User</b></a> | <a href="NotFound.html">User
                    List</b></a> | <a href="NotFound.html">Add College</b></a> | <a href="NotFound.html">College
                    List</b></a> | <a href="NotFound.html">Add
                    Student</b></a> | <a href="NotFound.html">Student List</b></a> | <a href="NotFound.html">Add
                    Role</b></a> | <a href="NotFound.html">Role
                    List</b></a> | |
            </td>
        </tr>
    </table>
    <hr>
    <form action="ChangePassword.html">

        <center>
            <h1>My Profile</h1>

            <H2>
                <font color="red">
                </font>
            </H2>

            <input type="hidden" name="id" value="36">
            <input type="hidden" name="createdBy" value="">
            <input type="hidden" name="modifiedBy" value="0">
            <input type="hidden" name="createdDatetime" value="0">
            <input type="hidden" name="modifiedDatetime" value="0">

            <table>
                <tr>
                    <th>LoginId*</th>
                    <td><input type="text" name="login" >
                        <font color="red"> </font>
                    </td>
                </tr>

                <tr>
                    <th>First Name*</th>
                    <td><input type="text" name="firstName" value="">
                        <font color="red"> First Name is required</font>
                    </td>
                </tr>
                <tr>
                    <th>Last Name*</th>
                    <td><input type="text" name="lastName" value="">
                        <font color="red"> Last Name is required</font>
                    </td>
                </tr>
                <tr>
                    <th>Gender</th>
                    <td>
                        <select class='form-control' name='gender'>
                            <option selected value='F'>Female</option>
                            <option value='M'>Male</option>
                        </select>
                    </td>
                </tr>
                <tr>
                    <th>Mobile No*</th>
                    <td><input type="text" name="mobileNo" value="">
                        <font color="red"> MobileNo is required</font>
                    </td>
                </tr>

                <tr>
                    <td>Date Of Birth (mm/dd/yyyy)</td>
                    <td>
                        <input type="date" name="dob" id="dateofbirtd">
                        <font class="error"> </font>
                    </td>
                </tr>
                <tr>
                    <td colspan="2">
                        <input type="submit" name="operation" value="Save"> &nbsp;
                        <input type="submit" name="operation" value="ChangePassword"> &nbsp;
                    </td>
                </tr>
            </table>
    </form>
    </center>
    <HR>
    <CENTER>
        <H3>(c) Copyrights SunilOS Infotech Pvt. Ltd.</H3>

    </CENTER>



</body>
</html>