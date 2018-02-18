<?PHP
$myFile = "Employees.txt";
$fh = fopen($myFile, 'r');
$empName = $_GET['name'];

$nameArray = array ("","","","","","","","","","");
$salariesArray = array ("","","","","","","","","","");

echo "<H1>Excercise 5 </h1>";


	for ($i = 0; $i < count($nameArray); $i++){
		$theData = fgets($fh);
		$theDat = fgets($fh);
		$nameArray[$i] = $theData;
		$salariesArray[$i] = $theDat;
	}
$temp = 0;	
	for ($i = 0; $i < count($nameArray); $i++){
		$name = $nameArray[$i];
		switch($empName){
			case $empName == "Nyan" :
				$temp = $salariesArray[0];
				break;
			case $empName == "Craig" :
				$temp = $salariesArray[1];
			    break;
			case $empName == "Edward" :
				$temp = $salariesArray[2];
			    break;
			case $empName == "Kate" :
				$temp = $salariesArray[3];
			    break;
			case $empName == "NuNu" :
				$temp = $salariesArray[4];
			    break;
			case $empName == "Esarr" :
				$temp = $salariesArray[5];
			    break;
			case $empName == "Gates" :
				$temp = $salariesArray[6];
			    break;
			case $empName == "Kells" :
				$temp = $salariesArray[7];
			    break;
			case $empName == "Rawr" :
				$temp = $salariesArray[8];
			    break;
			case $empName == "Random" :
				$temp = $salariesArray[9];
			    break;				
		}
	}
	
	echo $temp;
fclose($fh);


echo "
	  <form  action = 'search.PHP' method = 'GET'>
	  <center><h1>Employee Salary Excercise 5</h1></center>
	  <center>Employee Name : <input type = 'Text' name = 'name' value = '' ></center>
	  <center>Employee Salary : <input type = 'text' name = 'Salary' value = '$temp'  alt = '0'><br></center>
	  <center><input type = 'submit' name = 'Search' value = 'Search'></center><br>
	  </form>
	  ";
?>