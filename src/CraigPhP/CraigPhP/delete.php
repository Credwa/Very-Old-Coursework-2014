<?PHP
$myFile = "Employees.txt";
$fh = fopen($myFile, 'r');
$empName = $_GET['name'];

$mydelFile = "DeleteEmployees.txt";
$fh2 = fopen($mydelFile, 'a');

$nameArray = array ("","","","","","","","","","");
$salariesArray = array ("","","","","","","","","","");

echo "<H1>Excercise 5 </h1>";


	for ($i = 0; $i < count($nameArray); $i++){
		$theData = fgets($fh);
		$theDat = fgets($fh);
		$nameArray[$i] = $theData;
		$salariesArray[$i] = $theDat;
	}	
		switch($empName){
			case $empName != "Nyan" :
			if ($empName!= "Nyan"){
				fwrite($fh2, "$nameArray[0]\r\n");
				fwrite($fh2, "$salariesArray[0]\r\n\n");
			}
		
			case $empName != "Craig" :
			if ($empName != "Craig"){
				fwrite($fh2, "$nameArray[1]\r\n");
				fwrite($fh2, "$salariesArray[1]\r\n\n");
			}
			case $empName != "Edward" :
			if ($empName!= "Edward"){
				fwrite($fh2, "$nameArray[2]\r\n");
				fwrite($fh2, "$salariesArray[2]\r\n\n");
			 }  
			case $empName != "Kate" :
			if ($empName!= "Kate"){
				fwrite($fh2, "$nameArray[3]\r\n");
				fwrite($fh2, "$salariesArray[3]\r\n\n");
			 }   
			case $empName != "NuNu" :
			if ($empName!= "NuNu"){
				fwrite($fh2, "$nameArray[4]\r\n");
				fwrite($fh2, "$salariesArray[4]\r\n\n");
			}   
			case $empName != "Esarr" :
			if ($empName!= "Esarr"){
				fwrite($fh2, "$nameArray[5]\r\n");
				fwrite($fh2, "$salariesArray[5]\r\n\n");
			}
			   
			case $empName != "Gates" :
			if ($empName!= "Gates"){
				fwrite($fh2, "$nameArray[6]\r\n");
				fwrite($fh2, "$salariesArray[6]\r\n\n");
			}
			    
			case $empName != "Kells" :
			if ($empName!= "Kells"){
				fwrite($fh2, "$nameArray[7]\r\n");
				fwrite($fh2, "$salariesArray[7]\r\n\n");
			}
		
			case $empName != "Rawr" :
			if ($empName!= "Rawr"){
				fwrite($fh2, "$nameArray[8]\r\n");
				fwrite($fh2, "$salariesArray[8]\r\n\n");
			}
			
			case $empName != "Random" :
			if ($empName!= "Random"){
				fwrite($fh2, "$nameArray[9]\r\n");
				fwrite($fh2, "$salariesArray[9]\r\n\n");
			}
			break;
			 
		}


	

fclose($fh);


echo "
	  <form  action = 'delete.php' Salary Excercise 5</h1></center>
	  <center>Employee Name : <input type = 'Text' name = 'name' value = '' ></center>
	  <center><input type = 'submit' name = 'Delete' value = 'Delete'></center><br>
	  </form>
	  ";
?>