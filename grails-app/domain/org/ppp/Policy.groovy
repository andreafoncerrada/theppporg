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
    registryNumber(size:1..500000)
    registryCode(size:1..500000)
    policyAreaPP(size:1..500000)
    policySubcategory(size:1..500000)
    title(size:1..500000)
    theAbstract(size:1..7000)
    tags(size:1..500000)
    country(size:1..500000)
    state(size:1..500000)
    countyMunicipality(size:1..500000)
    cityMetropolitanArea(size:1..500000)
    language(size:1..500000)
    targetedPopulation(size:1..500000)
    populationAffectedByTheProgram(size:1..500000)
    budget(size:1..500000)
    fundingDetails(size:1..500000)
    sponsors(size:1..5000)
    timeBetweenEnactmentAndFunding(size:1..500000)
    reasonForEnactment(size:1..7000)
    problem(size:1..7000)
    desiredOutcome(size:1..7000)
    outcomes(size:1..7000)
    evidenceQuality(size:1..7000)
    linkToExternalEvaluation(size:1..50000)
    linkToPolicyDocuments(size:1..50000)
    linkToOtherDocumentationAboutThePolicy(size:1..50000)
    evaluationBased(size:1..7000)
    dateOfEnactment(size:1..500000)
    dateOfImplementation(size:1..500000)
    dateOfClosure(size:1..500000)
    durationOfProgram(size:1..500000)
    legislativeReformsActs(size:1..7000)
    totalAnnualOperationalCosts(size:1..500000)
    staffCosts(size:1..500000)
    transferCosts(size:1..500000)
    materialCosts(size:1..500000)
    otherCosts(size:1..500000)
    implementationTeamSizeNumber(size:1..7000)
    stakeholdersPolicyMakers(size:1..7000)
    stakeholdersCongressmen(size:1..7000)
    stakeholdersNGOs(size:1..7000)
    stakeholdersOthers(size:1..7000)
    partners(size:1..7000)
    evidenceStrongTheoryOfChange(size:1..50000)
    processMapAvailable(size:1..50000)
    implementorsAvailableForComment(size:1..5000)
    authors(size:1..7000)
    authorsRelatedWork(size:1..5000)
    linkToAuthorsRelatedWork(size:1..5000)
    relatedPolicies(size:1..500000)
    released_by(size:1..50000)
    linkToReleasedEntity(size:1..5000000)
    fileType(size:1..500000)
    fileCode(size:1..5000000)
    fileFormat(size:1..500000)
    evaluatedBy(size:1..50000)
    linkToEvalutionEntity(size:1..5000000)
    analysisType(size:1..5000000)

  }
}
