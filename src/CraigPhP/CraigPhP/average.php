<?PHP

$myFile = "Employees.txt";
$fh = fopen($myFile, 'r');

//function to find average of salaries
function average(){
	$myFile = "Employees.txt";
	$fh = fopen($myFile, 'r');
	$total = 0;
	While(!feof($fh)){
		$theData = fgets($fh);
		$theDat = fgets($fh);
		$total += $theDat;
		
	}
	return $total;
}

// call function average
$avg = average() /11;
echo "<h1>The average of the salaries are : $".$avg."<br><br>";


While (!feof($fh)){
	$theData = fgets($fh);
	$theDat = fgets($fh);
	
	//open or write to if salary more than average
	if ($theDat >$avg){
		$Aboveavg = "AboveAverage.txt";
		$fh1 = fopen($Aboveavg,"a") or die ("cannot open file");

		fwrite($fh1, "Employee Name : $theData\r\n");
		fwrite($fh1, "Employe Salary : $$theDat\r\n");
		
		echo $theData."Has been added to AboveAverage text file<br>";
		echo "They have a salary of : $".$theDat."<br><br>";
		
	}
	//open or write to if salary less than average
	if ($theDat < $avg){
		$Belowavg = "BelowAverage.txt";
		$fh2 = fopen($Belowavg,"a") or die ("cannot open file");

		fwrite($fh2, "$theData\r\n");
		fwrite($fh2, "Employe Salary : $$theDat\r\n\n");
		
		echo $theData."Has been added to BelowAverage text file<br>";
		echo "They have a salary of : $".$theDat."<br><br>";
	}
}





?>