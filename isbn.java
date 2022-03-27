function isbn13(str) {
	let d={0:0,1:1,2:2,3:3,4:4,5:5,6:6,7:7,8:8,9:9,X:10}
	if (str.length==13 && str.split('').reduce((a,n,i)=>a+d[n]*(3**i%8),0)%10==0){
		return 'Valid'
	}
	if (str.length==10 && str.split('').reduce((a,n,i)=>a+d[n]*(10-i),0)%11==0){
		let last = (1000-('978'+str.slice(0,-1)).split('').reduce((a,n,i)=>a+d[n]*(3**i%8),0))%10
		return '978' + str.slice(0,-1) + last.toString()
	}
	return 'Invalid'
}