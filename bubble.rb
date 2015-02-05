

target = [3,44,38,5,47,15,36,26,27,2,46,4,19,19,50,48]

# Just see and coding.. without exactly know 
def quick(target)

for i in 0..target.length-1 #..then -2?
	pivot = i
	sindex = pivot+1
	for j in pivot+1..target.length-1
		if target[j] < target[pivot]
			i , sindex = sindex , i
			sindex++
		end
		pivot , sindex-1 = sindex-1 , pivot
	end
end

puts target

end

quick(target)
=begin
#Not yet. it was mess it up
def insertion(target)
0.upto(target.length-1) do |iter|
	extract = target[iter]
	iter.downto(0) do |eter|
		if target[iter] > target[eter]
			target[eter] , target[iter] = target[iter] , target[eter]
		else
			#target[eter] = extract
		end
		puts "iter #{iter} // eter #{eter}"
		puts "target length #{target.length}"
	
	end
end
puts target
end
insertion(target)
=end


#Ruby-Style nt but doesnt work. 
=begin
def insertion(target)
#0.upto(target.length) do |iter|
(1..target.length-1).each do |i| # !!! Another case.. lol i can use this style now.
	value = target.delete_at(i)
	insertion_index = i
	insertion_index -= -1 while insertion_index > 0 && value < target[insertion_index -1]
	target.insert(insertion_index,value)
	end
	puts target
end
insertion(target)
=end

def bubble(target)
loop do
	swap = false

	0.upto(target.length-2) do |iter|# this is what i want to know
		if target[iter]>target[iter+1]
			target[iter] , target[iter+1] = target[iter+1] , target[iter]
			swap = true
		end
	end
	

	break unless swap
end

puts target
end



















