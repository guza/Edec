


dupS= "asdfqwerzxcvasdf"
dupS=dupS.split("")
puts dupS.class
#tried to convert string to array.

def firstdup(dupS)
	hash = Hash.new(0)
	dupS.each do |iter|
		hash[iter] +=1
		if hash[iter] == 2
			puts iter
			break

		end
	end
	puts hash
end


firstdup(dupS)








































