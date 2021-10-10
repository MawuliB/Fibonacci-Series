
n = int(input("Enter the number of terms: ")) #asking for the number of terms

series = []
#declaring the array series
i = 0
#declaring the variable to be used in the iteration
while i < n:
    if i == 0:
        series.append(0)
    if i == 1:
        series.append(1)
    if i > 1:
        series.append(series[i - 1] + series[i - 2])
    i = i + 1
print("The series are " + str(series))

