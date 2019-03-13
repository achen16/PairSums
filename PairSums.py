# function to check for the given sum
# in the array
def printPairs(arr, sum):

    # Create an empty hash set
    values = []
    pairs= []

    for i in arr:
        diff = sum - i

        if diff in values:
            pairs.append((i,diff))

        values.append(i)
        print (values)

    return set(pairs)


def main():
    A = [1, 5, 7, -1, 5]
    n = 6
    answer = printPairs(A, n)
    print (answer)

if __name__ == '__main__':
    main()
