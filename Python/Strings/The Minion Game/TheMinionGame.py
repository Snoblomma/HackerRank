def minion_game(string):
    score_st = 0
    score_k = 0
    
    for i in range(len(string)):
        if string[i] in 'AEIOU':
            score_k+=len(string)-i
        elif string[i] not in 'AEIOU':
            score_st+=len(string)-i
    
    if score_st > score_k:
        print('Stuart ' + str(score_st))
    elif score_st == score_k:
        print('Draw')
    elif score_st < score_k:
        print('Kevin ' + str(score_k))
    
if __name__ == '__main__':
    s = input()
    minion_game(s)
