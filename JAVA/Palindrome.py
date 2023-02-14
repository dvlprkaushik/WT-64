num = int(input("ENTER A NUMBER : "))
temp = num
rev = 0
while (num > 0):
    dig = num % 10
    rev = rev*10+dig
    num = num//10
    if (temp == rev):
        print("The number is Palindrome")

    else:
        print("IS NOT A PALINDROME")
