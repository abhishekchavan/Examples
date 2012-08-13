class Greeter
	def initialize(name = "World")
		@name = name
	end
	def say_hi
		puts "Hi #{@name}!"
	end
	def say_bye
		puts "Bye #{@name}, come back soon."
	end
end
 
g = Greeter.new("Sexy")
g.say_hi
g.say_bye
Greeter.instance_methods(false)
g.respond_to?("name")
puts g.respond_to?("say_hi")

class Greeter
  attr_accessor :name
end

g = Greeter.new("Andaman")
puts g.name