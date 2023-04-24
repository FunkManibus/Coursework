# Prompt user for hours worked and weekly sales

hours = eval(input('Enter Hours: '))
sales = eval(input('Enter Sales: '))

# Hourly rate is $20 an hour
# Commision is 20 precent of weekly sales

rate = 20
commission = (1/5) * sales

# Display the hours worked, commission, and total pay

print('Hours Worked:' ,hours)
print('Commission:' , commission)
print('Total Pay:', hours * rate + commission)
