package org.ppp

// TODO: Separate in different classes
class Policy {

  String registryNumber
  String registryCode
  String policyAreaPP
  String policySubcategory
  String title
  String theAbstract
  String tags
  String country
  String state
  String countyMunicipality
  String cityMetropolitanArea
  String language
  String targetedPopulation
  String populationAffectedByTheProgram
  String budget
  String fundingDetails
  String sponsors
  String timeBetweenEnactmentAndFunding
  String reasonForEnactment
  String problem
  String desiredOutcome
  String outcomes
  String evidenceQuality
  String linkToExternalEvaluation
  String linkToPolicyDocuments
  String linkToOtherDocumentationAboutThePolicy
  String evaluationBased
  String dateOfEnactment
  String dateOfImplementation
  String dateOfClosure
  String durationOfProgram
  String legislativeReformsActs
  String totalAnnualOperationalCosts
  String staffCosts
  String transferCosts
  String materialCosts
  String otherCosts
  String implementationTeamSizeNumber
  String stakeholdersPolicyMakers
  String stakeholdersCongressmen
  String stakeholdersNGOs
  String stakeholdersOthers
  String partners
  String evidenceStrongTheoryOfChange
  String processMapAvailable
  String implementorsAvailableForComment
  String authors
  String authorsRelatedWork
  String linkToAuthorsRelatedWork
  String relatedPolicies
  String released_by
  String linkToReleasedEntity
  String fileType
  String fileCode
  String fileFormat
  String evaluatedBy
  String linkToEvalutionEntity
  String analysisType

  static constraints = {
    registryNumber(size:255)
    registryCode(size:255)
    policyAreaPP(size:255)
    policySubcategory(size:255)
    title(size:255)
    theAbstract(size:1000)
    tags(size:255)
    country(size:255)
    state(size:255)
    countyMunicipality(size:255)
    cityMetropolitanArea(size:255)
    language(size:255)
    targetedPopulation(size:255)
    populationAffectedByTheProgram(size:255)
    budget(size:255)
    fundingDetails(size:255)
    sponsors(size:300)
    timeBetweenEnactmentAndFunding(size:255)
    reasonForEnactment(size:1000)
    problem(size:1000)
    desiredOutcome(size:1000)
    outcomes(size:1000)
    evidenceQuality(size:1000)
    linkToExternalEvaluation(size:500)
    linkToPolicyDocuments(size:500)
    linkToOtherDocumentationAboutThePolicy(size:500)
    evaluationBased(size:1000)
    dateOfEnactment(size:255)
    dateOfImplementation(size:255)
    dateOfClosure(size:255)
    durationOfProgram(size:255)
    legislativeReformsActs(size:1000)
    totalAnnualOperationalCosts(size:255)
    staffCosts(size:255)
    transferCosts(size:255)
    materialCosts(size:255)
    otherCosts(size:255)
    implementationTeamSizeNumber(size:1000)
    stakeholdersPolicyMakers(size:1000)
    stakeholdersCongressmen(size:1000)
    stakeholdersNGOs(size:1000)
    stakeholdersOthers(size:1000)
    partners(size:1000)
    evidenceStrongTheoryOfChange(size:500)
    processMapAvailable(size:500)
    implementorsAvailableForComment(size:300)
    authors(size:1000)
    authorsRelatedWork(size:300)
    linkToAuthorsRelatedWork(size:300)
    relatedPolicies(size:255)
    released_by(size:500)
    linkToReleasedEntity(size:100)
    fileType(size:10)
    fileCode(size:100)
    fileFormat(size:255)
    evaluatedBy(size:500)
    linkToEvalutionEntity(size:100)
    analysisType(size:100)

  }
}
