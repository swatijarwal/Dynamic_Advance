<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>

   <html>

<body>
    <table width="100%" border="0">
        <tr>
            <td width="90%">
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
                    Hi, Guest</h3>
            </td>
        </tr>
    </table>
    <hr>
    <center>
        <form action="welcome.html">
            <h1>Login</h1>
            <H2>
                <font color="red">Invalid Id and Password
                </font>
            </H2>

            <input type="hidden" name="id" value="0">
            <input type="hidden" name="createdBy" value="null">
            <input type="hidden" name="modifiedBy" value="null">
            <input type="hidden" name="createdDatetime" value="0">
            <input type="hidden" name="modifiedDatetime" value="0">
            <table>
                <tr>
                    <th>LoginId*</th>
                    <td><input type="text" name="login" size=30 value="">
                        <font color="red"> Login Id is required</font>
                    </td>
                </tr>
                <tr>
                    <th>Password*</th>
                    <td><input type="password" name="password" size=30 value="">
                        <font color="red"> Password is required</font>
                    </td>
                </tr>
                <tr>
                    <th></th>
                    <td colspan="2"><input type="submit" name="operation" value="SignIn"> &nbsp;

                    </td>
                </tr>
                <tr>
                    <td colspan="2" align="center"><a href="Signup.html"><b>Sign Up</b></a> | <a href="ForgotPassword.html"><b>Forget
                                my password</b></a>&nbsp;</td>
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