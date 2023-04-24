# This program shows the cost of hourly rate to the customer.

# Ask how many hours were worked

prompt = "How many hours were worked? "
hours_worked = eval(input(prompt))
print('Hours worked:', hours_worked)

# Ask the hourly rate

prompt = "What is the hourly rate? "
hourly_rate= eval(input(prompt))
print('Hourly rate: ', hourly_rate)

# Calculate the hourly rate times the hours worked

cost = hourly_rate * hours_worked
print('Cost:', cost)
