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
    registryNumber(size:1..255)
    registryCode(size:1..255)
    policyAreaPP(size:1..255)
    policySubcategory(size:1..255)
    title(size:1..255)
    theAbstract(size:1..1000)
    tags(size:1..255)
    country(size:1..255)
    state(size:1..255)
    countyMunicipality(size:1..255)
    cityMetropolitanArea(size:1..255)
    language(size:1..255)
    targetedPopulation(size:1..255)
    populationAffectedByTheProgram(size:1..255)
    budget(size:1..255)
    fundingDetails(size:1..255)
    sponsors(size:1..300)
    timeBetweenEnactmentAndFunding(size:1..255)
    reasonForEnactment(size:1..1000)
    problem(size:1..1000)
    desiredOutcome(size:1..1000)
    outcomes(size:1..1000)
    evidenceQuality(size:1..1000)
    linkToExternalEvaluation(size:1..500)
    linkToPolicyDocuments(size:1..500)
    linkToOtherDocumentationAboutThePolicy(size:1..500)
    evaluationBased(size:1..1000)
    dateOfEnactment(size:1..255)
    dateOfImplementation(size:1..255)
    dateOfClosure(size:1..255)
    durationOfProgram(size:1..255)
    legislativeReformsActs(size:1..1000)
    totalAnnualOperationalCosts(size:1..255)
    staffCosts(size:1..255)
    transferCosts(size:1..255)
    materialCosts(size:1..255)
    otherCosts(size:1..255)
    implementationTeamSizeNumber(size:1..1000)
    stakeholdersPolicyMakers(size:1..1000)
    stakeholdersCongressmen(size:1..1000)
    stakeholdersNGOs(size:1..1000)
    stakeholdersOthers(size:1..1000)
    partners(size:1..1000)
    evidenceStrongTheoryOfChange(size:1..500)
    processMapAvailable(size:1..500)
    implementorsAvailableForComment(size:1..300)
    authors(size:1..1000)
    authorsRelatedWork(size:1..300)
    linkToAuthorsRelatedWork(size:1..300)
    relatedPolicies(size:1..255)
    released_by(size:1..500)
    linkToReleasedEntity(size:1..100)
    fileType(size:1..10)
    fileCode(size:1..100)
    fileFormat(size:1..255)
    evaluatedBy(size:1..500)
    linkToEvalutionEntity(size:1..100)
    analysisType(size:1..100)

  }
}
