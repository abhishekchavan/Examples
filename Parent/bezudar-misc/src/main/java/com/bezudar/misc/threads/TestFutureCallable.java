/**
 * 
 */
package com.bezudar.misc.threads;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;

/**
 * @author Abhishek Chavan
 * 
 */
public class TestFutureCallable {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService executor = Executors.newFixedThreadPool(10);
		List<Future> list = new ArrayList<Future>();
		for (int i = 0; i < 1000; i++) {
			FutureTask<String> future = new FutureTask<String>(new Callable<String>() {

				@Override
				public String call() throws Exception {
					// TODO Auto-generated method stub
					return "a";
				}
			});
			executor.execute(future);
			list.add(future);
		}

		StringBuffer buffer = new StringBuffer();
		for (Future tas : list) {
			buffer.append(tas.get());
		}
		System.out.println(buffer);
		executor.shutdown();
	}
}
