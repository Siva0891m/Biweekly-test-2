import java.util.*;
class ThreeSum{
	public static void main(String[] args){
		int[] nums={-1,2,1,-4,100,-90,10};
		int target=4;
		System.out.println(sum(nums,target));
	}
	static int sum(int[] nums,int target){
		Arrays.sort(nums);
		int j=1,k=nums.length-1;
		int min=Integer.MAX_VALUE;
		int ans=Integer.MAX_VALUE;
		for(int i=0;i<nums.length;i++){
			j=i+1;
			k=nums.length-1;
			while(j<k){
				int sum=nums[i]+nums[j]+nums[k];
				int dif=Math.abs(sum-target);
				if(dif<min){
					min=dif;
					ans=sum;
				}
				if(dif>target) k--;
				else if(dif<target) j++;
				else return sum;
			}
		}
		return ans;
	}
}