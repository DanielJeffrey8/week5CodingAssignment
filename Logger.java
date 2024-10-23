package Logger;

		interface Logger 
		{
			public void Log(String x);
			public void Error(String y);
		}
		
		
		
		
				class AsteriskLogger implements Logger
				{
					public void Log(String word)
					{
						System.out.println( "***" + word + "***\n" );
					}

					public void Error(String word) 
					{
						System.out.println("******************\n" + "***Error: " + word + "***\n" + "******************");
						
					}
					
				}
				
				class SpacedLogger implements Logger
				{
					public void Log(String word) 
	
					{
						
						for ( int i = 0; i < word.length(); i++ )
						{
							System.out.print(" " + word.charAt(i));
						}
						System.out.println();
					}
					
					public void Error (String word)
					{
						System.out.print("Error:");
						for ( int i = 0; i < word.length(); i++ )
						{
							System.out.print(" " + word.charAt(i));
						}
						System.out.println();
					}
				}



