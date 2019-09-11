def companyLogo(line):
    line = sorted(line)
    freq={}
    for c in line:
        if (c in freq):
            freq[c]+=1
        else:
            freq[c] = 1

    sorted_x = sorted(freq.items(), key=lambda kv: kv[1], reverse=True)

    for i in range (3):
        print(str(sorted_x[i][0]) + ' ' +  str(sorted_x[i][1]))

if __name__ == '__main__':
    line = input()
    companyLogo(line)