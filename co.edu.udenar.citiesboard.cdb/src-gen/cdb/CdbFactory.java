/**
 */
package cdb;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see cdb.CdbPackage
 * @generated
 */
public interface CdbFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CdbFactory eINSTANCE = cdb.impl.CdbFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Dashboard</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dashboard</em>'.
	 * @generated
	 */
	Dashboard createDashboard();

	/**
	 * Returns a new object of class '<em>Visualisator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Visualisator</em>'.
	 * @generated
	 */
	Visualisator createVisualisator();

	/**
	 * Returns a new object of class '<em>Data Source</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data Source</em>'.
	 * @generated
	 */
	DataSource createDataSource();

	/**
	 * Returns a new object of class '<em>Chart</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Chart</em>'.
	 * @generated
	 */
	Chart createChart();

	/**
	 * Returns a new object of class '<em>Facebook</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Facebook</em>'.
	 * @generated
	 */
	Facebook createFacebook();

	/**
	 * Returns a new object of class '<em>Twitter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Twitter</em>'.
	 * @generated
	 */
	Twitter createTwitter();

	/**
	 * Returns a new object of class '<em>Youtube</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Youtube</em>'.
	 * @generated
	 */
	Youtube createYoutube();

	/**
	 * Returns a new object of class '<em>Social Media</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Social Media</em>'.
	 * @generated
	 */
	SocialMedia createSocialMedia();

	/**
	 * Returns a new object of class '<em>Pie Chart</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Pie Chart</em>'.
	 * @generated
	 */
	PieChart createPieChart();

	/**
	 * Returns a new object of class '<em>Bar Chart</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Bar Chart</em>'.
	 * @generated
	 */
	BarChart createBarChart();

	/**
	 * Returns a new object of class '<em>Data Entity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data Entity</em>'.
	 * @generated
	 */
	DataEntity createDataEntity();

	/**
	 * Returns a new object of class '<em>Streamed</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Streamed</em>'.
	 * @generated
	 */
	Streamed createStreamed();

	/**
	 * Returns a new object of class '<em>Persisted</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Persisted</em>'.
	 * @generated
	 */
	Persisted createPersisted();

	/**
	 * Returns a new object of class '<em>Method</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Method</em>'.
	 * @generated
	 */
	Method createMethod();

	/**
	 * Returns a new object of class '<em>Position</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Position</em>'.
	 * @generated
	 */
	Position createPosition();

	/**
	 * Returns a new object of class '<em>Mapc</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mapc</em>'.
	 * @generated
	 */
	Mapc createMapc();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	CdbPackage getCdbPackage();

} //CdbFactory
