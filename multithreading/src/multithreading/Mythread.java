package multithreading;

 class Mythread extends Thread{
	int start,end;
	public Mythread(int start, int end) {
		super();
		this.start = start;
		this.end = end;
	}
	@Override
	public void run() {
	
		for(int i=start;i<=end;i++)
		{int count=0;
			for (int j=2;j<start;j++)
			{
				if(i%j==0)
				{
				 count++;	
				}
				if(count==0)
				{
					System.out.println("prime numbers"+i);
				}
				
				
			}
			
		}
		
	}
	

}
