require 'open-uri'
require 'nokogiri'
require 'rubygems'
puts "songs name : "
song = gets.chomp
puts "[+]searching..."
puts song

url = "http://www.tjmedia.co.kr/tjsong/song_search_list.asp?"
puts "url = #{url}"
strType = "strType=0&strText="
strCond = "&strCond=0"

url = url+strType+song+strCond

puts url

result=""
open(url) do |iter|
	result = iter.read
end

target = Nokogiri::HTML(open(url))
puts target





































