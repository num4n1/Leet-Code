    public int[] intersect(int[] nums1, int[] nums2) {
		int i = 0, j = 0;
        int counter = 0;
        int size=0;
        Arrays.sort(nums2);
        Arrays.sort(nums1);
        int[] intersection = new int[0];
		while(j < nums2.length && i < nums1.length){
			if(nums1[i] == nums2[j]){
                intersection = Arrays.copyOf(intersection, ++size);
				intersection[counter++] = nums2[j];
				i++;
				j++;
			} else if(nums1[i] < nums2[j]){
				i++;
			} else{
				j++;
			}
		}
		return intersection;
    }
