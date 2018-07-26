package com.capgemini.boardgamecapmates.aspect;

@SpringBootApplication
public class ChallengeApplication implements ApplicationRunner {

    @Autowired
    private ChallengeService challengeService;

    public static void main(String[] args) {
        SpringApplication.run(ChallengeApplication.class, args);
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println(challengeService.showChallengesThrownBy(1));
    }
}