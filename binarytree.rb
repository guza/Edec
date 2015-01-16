module BinaryTree
	
	class Node
		attr_reader :value
		attr_accessor :left , :right

		def initialize(v)
			@value = v
		end
		
		def insert(v)
			case value <=> v
			when 1 then left.insert(v)
			when -1 then right.insert(v)
			when 0 then false
			end
		
		end
		
		def inspect
			"{#{value}::#{left.inspect}|#{right.inspect}}"
		end

		private

			def insert_left(v)
				if left
					left.insert(v)
				else
					self.left = Node.new(v)
				end
			end
			def insert_right(v)
				if right
					right.insert(v)
				else
					self.right=Node.new(v)
				end
			end	
	end

end


tree = BinaryTree::Node.new(10)
tree.insert(3)
puts tree.inspect




































