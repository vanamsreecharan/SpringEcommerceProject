package com.example.demo.repo;
import java.util.ArrayList;

import com.example.demo.model.JobPost;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public  interface JobRepo extends JpaRepository<JobPost,Integer> {

	List<JobPost> findByPostProfileContainingOrPostDescContaining(String postProfile, String postDesc);
	
	
	 /*List<JobPost> jobs = new ArrayList<>(Arrays.asList(
	            new JobPost(1, "Java Developer", "Good knowledge on Java", 1, Arrays.asList("Java")),
	            new JobPost(2, "Spring Boot Developer", "Backend API development", 2, Arrays.asList("Spring Boot", "Java", "REST")),
	            new JobPost(3, "Full Stack Developer", "Frontend and backend", 3, Arrays.asList("Angular", "Spring Boot", "MySQL")),
	            new JobPost(4, "Data Analyst", "Analyze data using Python", 2, Arrays.asList("Python", "Pandas", "SQL")),
	            new JobPost(5, "Data Analyst", "Analyze data using Python", 2, Arrays.asList("Python", "Pandas", "SQL"))

			 )); 
			public List<JobPost>getAllJobs(){
				return jobs;
			}
			public void addJob(JobPost job) {
				
				jobs.add(job);
				System.out.println(jobs);
			}
			public JobPost getJob(int postId) {
			for(JobPost job:jobs) {
				if(job.getPostId()==postId) {
					return job;
				}
			}
				return null;
			}
			public void updateJob(JobPost jobPost) {
				for(JobPost jobPost1:jobs) {
					if(jobPost1.getPostId()==jobPost.getPostId()) {
						jobPost1.setPostProfile(jobPost.getPostProfile());
						jobPost1.setPostDesc(jobPost.getPostDesc());
						jobPost1.setReqExperience(jobPost.getReqExperience());
						jobPost1.setPostTechStack(jobPost.getPostTechStack());;
					}
				}
				
			}
			public void deleteJob(int postId) {
			    Iterator<JobPost> iterator = jobs.iterator();
			    while (iterator.hasNext()) {
			        JobPost jobPost = iterator.next();
			        if (jobPost.getPostId() == postId) {
			            iterator.remove(); 
			            break; // optional, if IDs are unique
			        }
			    }
			}*/
}
				
			
			
		
