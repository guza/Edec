d_list = [7,1,6,3,4,3,9]

d_list2= [ 6,1,2,0,2,3,3,2,6]

#puts d_list.include?(7)

a_list=Hash.new(0)

d_list.each do |dup|
	a_list[dup] += 1
	if a_list[dup] > 1
		
	end
=begin
	if d_list.include?(dup)
		puts "yes"
	end
=end
#meaningless source.
end



#pretty simple code...

puts d_list.uniq
puts "--"
puts d_list2.uniq














































