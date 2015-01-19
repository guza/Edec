def simple_hash(key,size)
	return key%size
end

sht = simple_hash(16,31227)

puts sht



=begin
class HashTable

	

	class Node
		def initialize(key,value)
			@key = key
			@value=value
		end
	end

	attr_accessor :size ,:table
	def initialize(size , table)
		@size = size
		@table = table
	end
	
	def create(size)
	end

	def set_table(table,key,value)
		addr = hash(key,size)	
				
	end

	
end
=end
















































