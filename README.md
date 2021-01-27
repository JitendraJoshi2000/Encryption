# Encryption
This is Encryption algorithm designed by me. 

This python code takes 'Input.txt' test file and ask password for encryption/decryption and creates 'Output.txt' file.

<b>Pseudo Code</b>


<b>Encryption</b>


input password

input key // To Encrypt password

arr[] = array of characters from ASCII values 32 i.e' ' to 126 i.e'~'

derive 2 int(inc,inc_factor) values from key(Using any method)

for each char c in key:

	pass ASCII value of c as seed and shuffle arr
	
arr[] //Original arr

shuff_arr[] //Shuffled arr

enc_password=""

flag=0

for each char c in password:

	i = index of c from arr
  
	if flag=0:
  
		i = (i+inc)%95
    
	else:
  
		i = (i-inc)%95
    
	enc_password += shuff_arr[i]
  
	inc = (inc+inc_factor)%95

output enc_password // Encrypted Password


<b>Decryption</b>

input enc_password // incrypted password

input key // To Decrypt password

arr[] = array of characters from ASCII values 32 i.e' ' to 126 i.e'~'

derive 2 int(inc,inc_factor) values from key(Using same method used in encryption algo)

for each char c in key:

	pass ASCII value of c as seed and shuffle arr
	
arr[] //Original arr

shuff_arr[] //Shuffled arr

dec_password=""

flag=1

for each char c in password:

	i = index of c from arr
  
	if flag=0:
  
		i = (i+inc)%95
    
	else:
  
		i = (i-inc)%95
    
	dec_password += shuff_arr[i]
  
	inc = (inc+inc_factor)%95

output dec_password // Decrypted Password
