kitty_toys = [
  {:shape => 'sock', :fabric => 'cashmere'},
  {:shape => 'mouse', :fabric => 'calico'},
  {:shape => 'eggroll', :fabric => 'chenille'}
]

kitty_toys.sort_by{ |toy| toy[:shape]}.each do |toy|
  print "Toy is #{toy[:shape]} and #{toy[:fabric]}\n"
end

kitty_toys.each do |toy|
  next if toy[:shape] == 'sock'
    print "#{toy}\n"
end