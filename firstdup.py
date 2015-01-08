

def firstdup(dupS):
	dic = {}
	for iter in range(len(dupS)):
		dic[iter]=dupS.count(dupS[iter])
		if dic[iter] == 2:
			print dupS[iter]
			break
	print dic



if __name__ == "__main__":
	dupS="asdfqwerzxcvasdf"
	firstdup(dupS)



































