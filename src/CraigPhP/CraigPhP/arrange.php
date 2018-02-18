<?PHP
$myFile = "Employees.txt";
$fh = fopen($myFile, 'r');

$myNewFile = "NewEmployees.txt";
$fh2 = fopen($myNewFile,"a") or die ("cannot open file");

$nameArray = array ("","","","","","","","","","");
$salariesArray = array ("","","","","","","","","","");

echo "<H1>Excercise 6 </h1>";


	for ($i = 0; $i < count($nameArray); $i++){
		$theData = fgets($fh);
		$theDat = fgets($fh);
		$nameArray[$i] = $theData;
		$salariesArray[$i] = $theDat;
	}
	
	array_multisort($salariesArray, SORT_NUMERIC,$nameArray);
	
	for ($i = count($nameArray)-1; $i != -1; $i--){
		fwrite($fh2, "$nameArray[$i]\r\n");
		fwrite($fh2, "$salariesArray[$i]\r\n\n");
	}
fclose($fh);
?>