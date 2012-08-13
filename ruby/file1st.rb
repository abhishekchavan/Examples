require_relative 'wordlist.rb'

 # Get evil idea and swap in code words
print "Enter your new idea: " 
idea = gets
code_words.each do |real, code| 
  idea.gsub!( real, code )
end

 # Save the jibberish to a new file
print "File encoded.  Please enter a name for this idea: " 
File::open( "file.txt", "w" ) do |f|
  f << idea
end