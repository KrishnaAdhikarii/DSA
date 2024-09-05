def trapped(heights):
   if not heights:
      return

   n=len(heights)
   leftMax=[0]*n 
   rightMax=[0]*n 

   leftMax[0]=heights[0]
   for i in range(1,n):
      leftMax[i]=max(leftMax[i-1],heights[i])

      
   rightMax[n-1]=heights[n-1]
   for o in range (n-2,-1,-1):
      rightMax[o]=max(rightMax[o+1],heights[o])
   

   waterTrapped=0
   for i in range(n):
      waterTrapped+= max(0,min(leftMax[i],rightMax[i])-heights[i])

   return waterTrapped

heights = [10,1,0,2,1,0,1,3,2,1,2,10]
print(trapped(heights))
      
