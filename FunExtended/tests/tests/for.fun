#test for for loops

proc main ():
	for i = 0 to 10:
		write(i).
		
	for i = 0 to 50
		j = i * 4
		if j >= 40:
			i = j
			break
		.
	.
	write(i)
	.
.