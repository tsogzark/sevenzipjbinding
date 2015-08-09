package net.sf.sevenzipjbinding;

/**
 * The interface provides functionality to update existing Tar archives.<br>
 * The standard way of getting the implementation of this interface is to use
 * {@link IInArchive#getConnectedOutArchive()} method like this:<br>
 * <br>
 * 
 * <pre>
 *  {@link IInArchive} inArchive = {@link SevenZip}.openInArchive(null, inStream);
 *  {@link IOutUpdateArchive}{@code <}{@link IOutItemBase}> outArchive = inArchive.openOutArchive();
 *  
 *  if (outArchive instanceof {@link IOutUpdateArchiveTar}) {
 *    {@link IOutUpdateArchiveTar} outUpdateArchiveTarz = ({@link IOutUpdateArchiveTar})outArchive;
 *    ...
 *  }
 *  
 *  ...
 *  
 *  inArchive.close();
 * </pre>
 * 
 * @see IOutUpdateArchive
 * @see IInArchive
 * @see IOutItemBase
 * @see IOutItemAllFormats
 * 
 * @author Boris Brodski
 * @version 9.13-2.0
 */
public interface IOutUpdateArchiveTar extends IOutUpdateArchive<IOutItemTar> {
}