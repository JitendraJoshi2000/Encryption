#Importing Libraries
import numpy as np
import random

#Encrypt/Decrypt (Depends on flag) Line by Line
def Encryption(txt,key,flag):
    list=np.array([])
    for i in range(32,127):
        list=np.append(list,chr(i))        
    for i in key:
        np.random.seed(ord(i))
        np.random.shuffle(list)           
    increment=int((ord(key[0]))%100)
    i=1
    while(key[i]==key[0]):
        i=i+1
        if(i>=len(key)):
            i=0
            break
    inc_factor=int((ord(key[i]))%100)
    enc_txt=""
    for i in txt:
        if(i=='\n'):
            break
        if(flag):
            for j in range(len(list)):
                if(i==list[j]):
                    enc_txt += list[(j+increment)%95]
                    flag=0
                    break
        else:
            for j in range(len(list)):
                if(i==list[j]):
                    enc_txt += list[(j-increment)%95]
                    flag=1
                    break
        increment = (increment+inc_factor)%95
    return(enc_txt)

#File Operations and Encryption() Line by Line
def EncryptFile(flag):
    password=input("Enter Password : ")
    inFile = open('Input.txt', 'r')
    outFile = open('Output.txt', 'w')
    while True:
        inLine=inFile.readline()
        if not inLine:
            break
        outLine = Encryption(inLine,password,flag) + '\n'
        outFile.write(outLine)
    inFile.close()
    outFile.close()

#Main
if __name__ == '__main__':
    print("\nEncryption And Decryption :-")
    ch=1
    while True:
        print("\n1.Encrypt Message")
        print("2.Decrypt Message")
        ch=int(input("Enter Your Choice : "))
        if (ch==1):
            EncryptFile(1)
            break
        elif (ch==2):
            EncryptFile(0)
            break
        else:
            print("\nPlease Enter Valid Choice...\n")
    