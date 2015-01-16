class Node
 attr_accessor :node, :next
 def initialize(node)
 @node = node
 end
 
 def self.node_list(node,msg=nil)
 msg ||= ""
 return msg[0..-4] if node.nil?
 node_list(node.next,msg<<"#{node.node}")
 end

end

node=Node.new(1)
node2=Node.new(2)
node.next=node2

puts Node.node_list node
































