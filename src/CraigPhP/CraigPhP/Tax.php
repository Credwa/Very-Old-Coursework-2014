<?PHP
$myFile = "Employees.txt";
$fh = fopen($myFile, 'r');
$tax = 0.15;

$x = 0;
echo "<H1>Excercise 3 Find the employees salaries with after tax</h1>";
While (!feof($fh)){
	$theData = fgets($fh);
	$theDat = fgets($fh);

	echo $x++.") ".$theData;
	echo "<br>";
	echo "Employee Salary is : $".$theDat."<br>";
	$total = $theDat - ($tax*$theDat);
	$taxShow = $theDat * $tax;
	echo "Tax to be paid is : $".$taxShow."<br>";
	Echo "Employee Salary after tax is : $".$total;

	echo "<br><br>";
}

fclose($fh);
?>