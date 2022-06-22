package com.ziqni.gateway.client.data;//package com.ziqni.admin.client.data;
//
//import com.ziqni.admin.client.ApiClientFactory;
//import com.ziqni.admin.client.ApiException;
//import com.ziqni.admin.client.api.AchievementsApi;
//import com.ziqni.util.DateUtil;
//import tests.utils.CompleteableFutureTestWrapper;
//
//import java.util.*;
//import java.util.stream.Collectors;
//import java.util.stream.IntStream;
//
//import static org.junit.jupiter.api.Assertions.assertNotNull;
//import static org.junit.jupiter.api.Assertions.assertTrue;
//
//public class LoadAchievementsData implements CompleteableFutureTestWrapper {
//
//    private AchievementsApi api;
//
//    public String subRuleConstant = "Constant";
//    public String subRuleFact = "Fact";
//    public String subRuleOperator = "Operator";
//
//    public LoadAchievementsData() {
//        this.api = this.api = ApiClientFactory.getAchievementsApi();
//    }
//
//    public CreateAchievementRequest getCreateRequest(String rewardTypeId) {
//        final var givenName = "Test_name-" + UUID.randomUUID().toString();
//        final var givenIcon = "Test_icon-" + UUID.randomUUID().toString();
//
//        final var subRule = new SubRule()
//                .constant(subRuleConstant)
//                .fact(subRuleFact)
//                .operator(subRuleOperator);
//
//        final var ruleSubCondition = new RuleSubCondition()
//                .constraints(List.of("constraint_example"))
//                .matchCondition(MatchCondition.ANY)
//                .subRules(List.of(subRule));
//
//        final var rule = new Rule()
//                .constant("Constant_example")
//                .fact("fact_test")
//                .operator("operator_test")
//                .subConditions(List.of(ruleSubCondition));
//
//        final var condition = new Condition()
//                .constraints(List.of("isPublic"))
//                .matchCondition(MatchCondition.ANY)
//                .rules(List.of(rule));
//
//        final var givenRuleSet = List.of(new RuleSet()
//                .conditions(List.of(condition))
//                .scope(RuleScope.ACHIEVEMENT));
//
//        final var givenScheduling = new Scheduling()
//                .scheduleType(ScheduleType.ONCE)
//                .scheduleOccurrencesLimit(1)
//                .startDate(DateUtil.now())
//                .endDate(DateUtil.now().plusMonths(1))
//                .constraints(new ArrayList<>());
//        final var givenMembersGroup = new ArrayList<String>();
//        final var givenConstraints = new ArrayList<String>();
//
//        final var rewardName = "Given Pfunguro";
//        final var givenRewardRank = "1,2,3,4-10";
//        final var givenRewardValue = new Random().nextDouble();
//
//        final var createRewardRequest = new CreateRewardRequest()
//                .name(rewardName)
//                .rewardRank(givenRewardRank)
//                .rewardTypeId(rewardTypeId)
//                .rewardValue(givenRewardValue)
//                .constraints(givenConstraints)
//                .period(100)
//                .description("Test_description")
//                .delay(100);
//
//        /*var dependantOn = new DependantOn();
//        dependantOn.setShould(List.of("qyxQrHsBJkJ44GoW8b-E"));
//        dependantOn.setShouldMatchAtLeast(1);
//*/
//  /*      var dependency = new Dependancy();
//        dependency.setDependantOn(dependantOn);
//        dependency.setEntityType(EntityType.ACHIEVEMENT.getValue());
//*/
//        return new CreateAchievementRequest()
//                .achievementLiveStatus(AchievementLiveStatus.LIVE)
//                .constraints(givenConstraints)
//                .description("test description")
//
////                .icon(givenIcon)
//                .name(givenName)
//                .maxNumberOfIssues(3)
//                .ruleSets(givenRuleSet)
//                .scheduling(givenScheduling)
//                .termsAndConditions("test terms and conditions")
//                .rewards(List.of(createRewardRequest));
//               // .dependantOn(dependency);
////                .memberGroups(givenMembersGroup)
//    }
//
//    public CreateAchievementRequest getCreateRequestWithRewards(List<CreateRewardRequest> rewards, String rewardTypeId) {
//        return getCreateRequest(rewardTypeId)
//                .rewards(rewards);
//    }
//
//    public List<CreateAchievementRequest> getCreateRequestAsList(int numberOfItems, String rewardTypeId) {
//        return IntStream.range(0, numberOfItems)
//                .mapToObj(i -> getCreateRequest(rewardTypeId))
//                .collect(Collectors.toList());
//    }
//
//    public List<CreateAchievementRequest> getCreateRequestAsList(CreateAchievementRequest request) {
//        return List.of(request);
//    }
//
//    public ModelApiResponse createTestData(List<CreateAchievementRequest> request) throws ApiException {
//        var response = $(api.createAchievements(request));
//
//        assertNotNull(response);
//        assertNotNull(response.getResults());
//        assertNotNull(response.getErrors());
//        assertEquals(request.size(), response.getResults().size(), "Should contain created entity");
//        assertNotNull(response.getResults().get(0).getId(), "Created entity should has id");
//
//        return response;
//    }
//
//
//    public void deleteTestData(List<String> idsToDelete) throws ApiException {
//        if(idsToDelete.size() > 0 ) {
//
//            var response = $(api.deleteAchievements(idsToDelete));
//
//            assertTrue(Objects.nonNull(response));
//            assertEquals(idsToDelete.size(), response.getMeta().getResultCount(), "Failed to delete some reward types");
//        }
//
//    }
//
//}
//
