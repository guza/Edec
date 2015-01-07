

d_list=[5,1,6,7,2,5,2 ]
d_list2=[9,1,5,2,3,2,7,5,5]

def duplicate(d_list):
	a_list={}
	for iter in range(len(d_list)):
		a_list[iter]=d_list.count(d_list[iter])	
#a_list[0]=d_list[0]
	print a_list
	for delete in a_list:
		if a_list.get(delete) >1:
		#	del d_list[delete]
			#d_list.pop(delete)
			print delete

	print d_list			









if __name__ == "__main__":	
	duplicate(d_list)	


































