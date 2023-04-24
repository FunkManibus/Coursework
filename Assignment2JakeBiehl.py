# Prompt the user for their age

age = int(input("Welcome, what is your age? "))

# Children and senior tickets are $9 and adult are $12

child_ticket = 9
adult_ticket = 12
senior_ticket = 9

if (age<= 12):
    print("Children tickets are", child_ticket)
if (age>= 60):
    print("Senior tickets are", senior_ticket)
if (age>= 13) and (age<= 60):
    print("Adult tickets are", adult_ticket)

# Prompt the user if the move is in 3D
# $3 extra charge for a 3D movie

three_d = input("Is the movie in 3D? Yes/No:")

three_d_cost = 3

if three_d.lower() == "yes":
    if age <= 12:
        print("The 3D child ticket costs", child_ticket + three_d_cost)
    elif age >= 60:
        print("The 3D senior ticket costs", senior_ticket + three_d_cost)
    else:
        print("The 3D adult ticket cost", adult_ticket + three_d_cost)
else:
    print("No 3D charge")
