package org.ppp

import grails.transaction.Transactional
import org.ppp.Policy

@Transactional
class PolicyService {

    def searchService

    def createPolicyEntity(List values) {
      Map policyProperties = [:]
      policyProperties.put("registryNumber",values.get(0) ?: "")
      policyProperties.put("registryCode",values.get(1) ?: "")
      policyProperties.put("policyAreaPP",values.get(2) ?: "")
      policyProperties.put("policySubcategory",values.get(3) ?: "")
      policyProperties.put("title",values.get(4) ?: "")
      policyProperties.put("theAbstract",values.get(5) ?: "")
      policyProperties.put("tags",values.get(6) ?: "")
      policyProperties.put("country",values.get(7) ?: "")
      policyProperties.put("state",values.get(8) ?: "")
      policyProperties.put("countyMunicipality",values.get(9) ?: "")
      policyProperties.put("cityMetropolitanArea",values.get(10) ?: "")
      policyProperties.put("language",values.get(11) ?: "")
      policyProperties.put("targetedPopulation",values.get(12) ?: "")
      policyProperties.put("populationAffectedByTheProgram",values.get(13) ?: "")
      policyProperties.put("budget",values.get(14) ?: "")
      policyProperties.put("fundingDetails",values.get(15) ?: "")
      policyProperties.put("sponsors",values.get(16) ?: "")
      policyProperties.put("timeBetweenEnactmentAndFunding",values.get(17) ?: "")
      policyProperties.put("reasonForEnactment",values.get(18) ?: "")
      policyProperties.put("problem",values.get(19) ?: "")
      policyProperties.put("desiredOutcome",values.get(20) ?: "")
      policyProperties.put("outcomes",values.get(21) ?: "")
      policyProperties.put("evidenceQuality",values.get(22) ?: "")
      policyProperties.put("linkToExternalEvaluation",values.get(23) ?: "")
      policyProperties.put("linkToPolicyDocuments",values.get(24) ?: "")
      policyProperties.put("linkToOtherDocumentationAboutThePolicy",values.get(25) ?: "")
      policyProperties.put("evaluationBased",values.get(26) ?: "")
      policyProperties.put("dateOfEnactment",values.get(27) ?: "")
      policyProperties.put("dateOfImplementation",values.get(28) ?: "")
      policyProperties.put("dateOfClosure",values.get(29) ?: "")
      policyProperties.put("durationOfProgram",values.get(30) ?: "")
      policyProperties.put("legislativeReformsActs",values.get(31) ?: "")
      policyProperties.put("totalAnnualOperationalCosts",values.get(32) ?: "")
      policyProperties.put("staffCosts",values.get(33) ?: "")
      policyProperties.put("transferCosts",values.get(34) ?: "")
      policyProperties.put("materialCosts",values.get(35) ?: "")
      policyProperties.put("otherCosts",values.get(36) ?: "")
      policyProperties.put("implementationTeamSizeNumber",values.get(37) ?: "")
      policyProperties.put("stakeholdersPolicyMakers",values.get(38) ?: "")
      policyProperties.put("stakeholdersCongressmen",values.get(39) ?: "")
      policyProperties.put("stakeholdersNGOs",values.get(40) ?: "")
      policyProperties.put("stakeholdersOthers",values.get(41) ?: "")
      policyProperties.put("partners",values.get(42) ?: "")
      policyProperties.put("evidenceStrongTheoryOfChange",values.get(43) ?: "")
      policyProperties.put("processMapAvailable",values.get(44) ?: "")
      policyProperties.put("implementorsAvailableForComment",values.get(45) ?: "")
      policyProperties.put("authors",values.get(46) ?: "")
      policyProperties.put("authorsRelatedWork",values.get(47) ?: "")
      policyProperties.put("linkToAuthorsRelatedWork",values.get(48) ?: "")
      policyProperties.put("relatedPolicies",values.get(49) ?: "")
      policyProperties.put("released_by",values.get(50) ?: "")
      policyProperties.put("linkToReleasedEntity",values.get(51) ?: "")
      policyProperties.put("fileType",values.get(52) ?: "")
      policyProperties.put("fileCode",values.get(53) ?: "")
      policyProperties.put("fileFormat",values.get(54) ?: "")
      policyProperties.put("evaluatedBy",values.get(55) ?: "")
      policyProperties.put("linkToEvalutionEntity",values.get(56) ?: "")
      policyProperties.put("analysisType",values.get(57) ?: "")
      Policy policy = new Policy(policyProperties)
      policy.save()
      searchService.addPolicy(policy)
      policy
    }
}
