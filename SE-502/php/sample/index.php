<?php
include("header.php");
include("menu.php");
?>
<div id="main_content">
<br><br><br>
    <form action="actionpage.php" method="post">
        <table>
            <tr>
                <td>First Name:</td>
                <td><input type="text" name="fname"/></td>
            </tr>
            <tr>
                <td>Last Name:</td>
                <td><input type="text" name="lname"/></td>
            </tr>
            <tr>
                <td>Email:</td>
                <td><input type="email" name="email"/></td>
            </tr>
            <tr>
                <td>Mobile:</td>
                <td><input type="number" name="mobile"/></td>
            </tr>
            <tr>
                <td>Address:</td>
                <td><input type="text" name="address"/></td>
            </tr>
        </table>
    
        
        <input type="submit" name="submit" value="Submit"/><br>
    </form>

</div>
<?php
include("footer.php");
?>