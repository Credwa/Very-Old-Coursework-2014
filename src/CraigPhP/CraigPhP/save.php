<?PHP

$Name = $_GET['name'];
$Salary = $_GET['Salary'];
$fn = "Employees.txt";

$fh = fopen($fn,"a") or die ("cannot open file");
if(isset($_GET['Save'])){

	fwrite($fh, "$Name\r\n");
	fwrite($fh, "$Salary\r\n\n");
}
else
fclose($fh);

//Html code in echo
echo "
	  <form  action = 'save.PHP' method = 'GET'>
	  <center><h1>Employee Salary Excercise 1</h1></center>
	  <center>Employee Name : <input type = 'Text' name = 'name' value = '' ></center>
	  <center>Employee Salary : <input type = 'number' name = 'Salary' value = '0'  alt = '0'><br></center>
	  <center><input type = 'submit' name = 'Save' value = 'Save'></center><br>
	  </form>
	  ";

?>