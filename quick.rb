sort = [5,1,6,4,8,3,7,9,2]
#class Array

	def partition(sort , left , right)
		pivot = sort[(left+right)/2]
		while ( left < right)
			while (sort[left] < pivot)
				left = left+1
			end
			while (sort[right] > pivot)
				right = right-1
			end
			if left<right
				sort[left] , sort[right] = sort[right] , sort[left]
			end
		end
		return left
	end
	
	def quick(sort,left,right)
		pivot = partition(sort,left,right)
		if(left < pivot-1)
			#quick sort left pivot-1
			quick(sort,left,pivot-1)
		end
		if(pivot<right)
		#	quick sort pivot right	
			quick(sort,pivot+1,right)
		end
	end


#end

#sort.partition(0,sort.length)


quick(sort,0,sort.length-1)
puts sort








