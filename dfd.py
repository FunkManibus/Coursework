# Prompt the user for hours worked this week


hours_worked = eval(input(prompt))
hourly_rate = 20
prompt = 'Weekly sales:'
weekly_sale = eval(input(prompt))
commission = (1/5) * weekly_sale
print('Total Pay:', hours_worked * hourly_rate + commission)
